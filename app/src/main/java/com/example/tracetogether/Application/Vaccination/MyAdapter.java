package com.example.tracetogether.Application.Vaccination;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracetogether.Data.Model.Vaccination_Record;
import com.example.tracetogether.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;

import java.util.HashMap;
import java.util.Map;

public class MyAdapter extends FirebaseRecyclerAdapter<Vaccination_Record,MyAdapter.myViewHolder> {


    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MyAdapter(@NonNull FirebaseRecyclerOptions<Vaccination_Record> options) {
        super(options);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vac_list,parent, false);
        return new myViewHolder(view);
    }

    //@Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull Vaccination_Record model) {
        holder.name.setText(model.getName());
        holder.ic.setText(model.getIc());
        holder.phoneNo.setText(model.getPhoneNo());
        holder.vacType.setText(model.getVacType());
        holder.vacLocation.setText(model.getVacLocation());
        holder.vacDate.setText(model.getVacDate());
        holder.vacTime.setText(model.getVacTime());

        //edit function
        holder.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final DialogPlus dialogPlus = DialogPlus.newDialog(holder.btnEdit.getContext())
                        .setContentHolder(new ViewHolder(R.layout.moh_edit_appt))
                        .setExpanded(true, 1200)
                        .create();

                //show the text in EditText
                View v = dialogPlus.getHolderView();

                EditText name = v.findViewById(R.id.etName);
                EditText ic = v.findViewById(R.id.etIc);
                EditText phoneNo = v.findViewById(R.id.etPhone);
                Button btnUpdate = v.findViewById(R.id.btnUp);

                name.setText(model.getName());
                ic.setText(model.getIc());
                phoneNo.setText(model.getPhoneNo());

                dialogPlus.show(); //show the edit pop-up

                //create Map to pass the updated data
                btnUpdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Map<String,Object> map = new HashMap<>();
                        map.put("name", name.getText().toString());
                        map.put("ic", ic.getText().toString());
                        map.put("phoneNo", phoneNo.getText().toString());

                        FirebaseDatabase.getInstance().getReference().child("patient_list")
                                .child(getRef(position).getKey()).updateChildren(map)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void unused) {
                                        Toast.makeText(holder.name.getContext(),"Data updated successfully", Toast.LENGTH_SHORT).show();
                                        dialogPlus.dismiss(); //close the dialog
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(holder.name.getContext(),"Error while updating", Toast.LENGTH_SHORT).show();
                                        dialogPlus.dismiss(); //close the dialog
                                    }
                                });
                    }
                });
            }
        });

        //delete function
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create dialog box
                AlertDialog.Builder builder = new AlertDialog.Builder(holder.name.getContext());
                builder.setTitle("Are you sure?");
                builder.setMessage("Deleted data cannot be undo");

                builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        FirebaseDatabase.getInstance().getReference().child("patient_list")
                                .child(getRef(position).getKey()).removeValue();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(holder.name.getContext(), "Cancelled", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show(); //show delete confirmation dialog box
            }
        });
    }

    class myViewHolder extends RecyclerView.ViewHolder {

        TextView name, ic, phoneNo, vacType, vacLocation, vacDate, vacTime;
        Button btnEdit, btnDelete;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tvName);
            ic = itemView.findViewById(R.id.tvIc);
            phoneNo = itemView.findViewById(R.id.tvPhone);
            vacType = itemView.findViewById(R.id.tvVacType);
            vacLocation = itemView.findViewById(R.id.tvVacLoc);
            vacDate = itemView.findViewById(R.id.tvVacDate);
            vacTime = itemView.findViewById(R.id.tvVacTime);
            btnEdit = itemView.findViewById(R.id.btnEd);
            btnDelete = itemView.findViewById(R.id.btnDel);
        }
    }
}
