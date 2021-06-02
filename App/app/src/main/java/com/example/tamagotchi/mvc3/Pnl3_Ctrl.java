package com.example.tamagotchi.mvc3;

import android.view.View;

import com.example.tamagotchi.PnlManager;
import com.example.tamagotchi.R;

public class Pnl3_Ctrl implements View.OnClickListener {
    public Pnl3_Mdl refMdl;

    public PnlManager refPnlManager;

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnPlus) {
            refMdl.incNbVaccins();
        }
        else if (view.getId() == R.id.btnMoins) {
            refMdl.decNbVaccins();
        }
        else if (view.getId() == R.id.btnRaz) {
            refMdl.raz();
        }
        else if (view.getId() == R.id.btnGotoPnl1) {
            refPnlManager.setPnl(1);
        }
    }
}