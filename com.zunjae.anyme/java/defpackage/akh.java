package defpackage;

import android.content.Intent;
import android.preference.Preference;
import com.zunjae.anyme.activities.settings.CustomizeActivity;

final class akh implements ajz {
    final /* synthetic */ akg a;

    akh(akg akg) {
        this.a = akg;
    }

    public final void a(Preference preference) {
        int b = aux.b("@@KEY_Custom_Column_Count", 3);
        int a = alc.a(true);
        preference.setSummary(String.format("Change the grid column count and size of the Anime cover image.\n\nCurrent settings: Column size: %d, Image Height: %d", new Object[]{Integer.valueOf(b), Integer.valueOf(a)}));
    }

    public final void b(Preference preference) {
        this.a.getActivity().startActivityForResult(new Intent(this.a.b, CustomizeActivity.class), 10);
    }
}
