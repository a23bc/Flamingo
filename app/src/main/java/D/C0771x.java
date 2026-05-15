package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: d.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0771x extends AbstractC0768u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f10806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f10807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f10808c;

    public C0771x(Field field, Field field2, Field field3) {
        this.f10806a = field;
        this.f10807b = field2;
        this.f10808c = field3;
    }

    @Override // d.AbstractC0768u
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f10808c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // d.AbstractC0768u
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f10806a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // d.AbstractC0768u
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f10807b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
