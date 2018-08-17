package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

public final class bt {
    private Object a;

    private bt(Object obj) {
        this.a = obj;
    }

    public static bt a(Activity activity, DragEvent dragEvent) {
        if (VERSION.SDK_INT >= 24) {
            DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
            if (requestDragAndDropPermissions != null) {
                return new bt(requestDragAndDropPermissions);
            }
        }
        return null;
    }
}
