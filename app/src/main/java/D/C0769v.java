package d;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769v extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0769v f10804p = new C0769v(0);

    @Override // l5.InterfaceC1180a
    public final Object a() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new C0771x(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return C0770w.f10805a;
        }
    }
}
