package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: q.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1326m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f15354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f15355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f15356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15357d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f15354a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f15355b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f15356c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f15357d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
