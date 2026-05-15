package C1;

import android.content.res.Resources;
import android.os.Trace;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.AbstractC1113a;
import k.I;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f932o;

    public /* synthetic */ a(int i7) {
        this.f932o = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DisplayMetrics displayMetrics;
        switch (this.f932o) {
            case 0:
            case 1:
                return;
            case 2:
                try {
                    int i7 = B1.k.f727a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (T1.j.d()) {
                        T1.j.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i8 = B1.k.f727a;
                    Trace.endSection();
                    throw th;
                }
            default:
                Resources system = Resources.getSystem();
                float f7 = Resources.getSystem().getDisplayMetrics().xdpi;
                system.getDisplayMetrics().xdpi = f7;
                i6.h.z().getResources().getDisplayMetrics().xdpi = f7;
                ArrayList arrayList = AbstractC1113a.f13877a;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            DisplayMetrics displayMetrics2 = (DisplayMetrics) ((Field) it.next()).get(system);
                            if (displayMetrics2 != null) {
                                displayMetrics2.xdpi = f7;
                            }
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    }
                    return;
                }
                AbstractC1113a.f13877a = new ArrayList();
                Class<?> superclass = system.getClass();
                Field[] declaredFields = superclass.getDeclaredFields();
                while (declaredFields != null && declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                            field.setAccessible(true);
                            try {
                                displayMetrics = (DisplayMetrics) field.get(system);
                            } catch (Exception unused) {
                                displayMetrics = null;
                            }
                            if (displayMetrics != null) {
                                AbstractC1113a.f13877a.add(field);
                                displayMetrics.xdpi = f7;
                            }
                            break;
                        }
                    }
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        return;
                    } else {
                        declaredFields = superclass.getDeclaredFields();
                    }
                }
                return;
        }
    }

    public a(I i7, int i8) {
        this.f932o = 0;
    }

    private final void a() {
    }

    private final void b() {
    }
}
