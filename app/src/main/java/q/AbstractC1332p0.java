package q;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: q.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1332p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f15367a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f15367a = declaredField;
    }
}
