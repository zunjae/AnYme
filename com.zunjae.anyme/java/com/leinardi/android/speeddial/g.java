package com.leinardi.android.speeddial;

final class g implements n {
    final /* synthetic */ SpeedDialView a;

    g(SpeedDialView speedDialView) {
        this.a = speedDialView;
    }

    public final boolean onActionSelected(d dVar) {
        if (this.a.k == null) {
            return false;
        }
        boolean onActionSelected = this.a.k.onActionSelected(dVar);
        if (!onActionSelected) {
            this.a.c();
        }
        return onActionSelected;
    }
}
