package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import m5.AbstractC1209k;
import p2.C1293c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends Y1.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static T f9725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N2.z f9726e = new N2.z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f9727c;

    public T(Application application) {
        super(2);
        this.f9727c = application;
    }

    @Override // Y1.s, androidx.lifecycle.U
    public final Q a(Class cls) {
        Application application = this.f9727c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // Y1.s, androidx.lifecycle.U
    public final Q b(Class cls, C1293c c1293c) {
        if (this.f9727c != null) {
            return a(cls);
        }
        Application application = (Application) c1293c.f14994a.get(f9726e);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0578a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return i6.g.s(cls);
    }

    public final Q d(Class cls, Application application) {
        if (!AbstractC0578a.class.isAssignableFrom(cls)) {
            return i6.g.s(cls);
        }
        try {
            Q q7 = (Q) cls.getConstructor(Application.class).newInstance(application);
            AbstractC1209k.c(q7);
            return q7;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}
