package com.example.roya.modernart;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;


public class InfoDialogFragment extends DialogFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info_dialog , container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        Button visitmomaButton = (Button) view.findViewById(R.id.momabtn);
        visitmomaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri momaUrl = Uri.parse("http://www.moma.org");
                Intent intent = new Intent(Intent.ACTION_VIEW, momaUrl);
                startActivity(intent);

            }
        });
        Button notnowButton = (Button) view.findViewById(R.id.notnowbtn);
        notnowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }

}
