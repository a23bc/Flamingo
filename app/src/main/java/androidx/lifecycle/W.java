package androidx.lifecycle;

import java.util.HashMap;
import m5.AbstractC1209k;
import m5.C1203e;
import p2.AbstractC1292b;
import p2.C1291a;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: b */
    public static final N2.z f9728b = new N2.z();

    /* JADX INFO: renamed from: a */
    public final Object f9729a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(X x6, U u7) {
        this(x6, u7, 0);
        AbstractC1209k.f(x6, "store");
    }

    public Q a(C1203e c1203e) {
        String str;
        Class cls = c1203e.f14428a;
        String canonicalName = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            HashMap map = C1203e.f14426c;
            if (zIsArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return ((U3.h) this.f9729a).X(c1203e, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public /* synthetic */ W(X x6, U u7, int i7) {
        this(x6, u7, C1291a.f14993b);
    }

    public W(X x6, U u7, AbstractC1292b abstractC1292b) {
        AbstractC1209k.f(x6, "store");
        AbstractC1209k.f(abstractC1292b, "defaultCreationExtras");
        AbstractC1209k.f(x6, "store");
        AbstractC1209k.f(abstractC1292b, "defaultExtras");
        U3.h hVar = new U3.h();
        hVar.f7042o = x6;
        hVar.f7043p = u7;
        hVar.f7044q = abstractC1292b;
        hVar.f7045r = new r2.c();
        this.f9729a = hVar;
    }

    public W(E e7) {
        this.f9729a = e7;
    }
}
