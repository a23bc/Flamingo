package N4;

import H2.C0196m;
import K4.x;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o extends x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5205a;

    /* JADX INFO: renamed from: b */
    public final Object f5206b;

    /* JADX INFO: renamed from: c */
    public final Object f5207c;

    /* JADX INFO: renamed from: d */
    public final Object f5208d;

    public o(C0196m c0196m, x xVar, Type type) {
        this.f5205a = 0;
        this.f5206b = c0196m;
        this.f5207c = xVar;
        this.f5208d = type;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        switch (this.f5205a) {
            case 0:
                return ((x) this.f5207c).a(aVar);
            default:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC = aVar.C();
                Enum r02 = (Enum) ((HashMap) this.f5206b).get(strC);
                return r02 == null ? (Enum) ((HashMap) this.f5207c).get(strC) : r02;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0062  */
    @Override // K4.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(R4.b r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f5205a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Lb
            r6 = 0
            goto L15
        Lb:
            java.lang.Object r0 = r4.f5208d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.w(r6)
            return
        L19:
            java.lang.Object r0 = r4.f5208d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2c
        L27:
            java.lang.Class r1 = r6.getClass()
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.Object r2 = r4.f5207c
            K4.x r2 = (K4.x) r2
            if (r1 == r0) goto L63
            java.lang.Object r0 = r4.f5206b
            H2.m r0 = (H2.C0196m) r0
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            K4.x r0 = r0.d(r1)
            boolean r1 = r0 instanceof N4.k
            if (r1 != 0) goto L44
            goto L62
        L44:
            r1 = r2
        L45:
            boolean r3 = r1 instanceof K4.k
            if (r3 == 0) goto L5d
            r3 = r1
            K4.k r3 = (K4.k) r3
            K4.x r3 = r3.f4052a
            if (r3 == 0) goto L55
            if (r3 != r1) goto L53
            goto L5d
        L53:
            r1 = r3
            goto L45
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r5.<init>(r6)
            throw r5
        L5d:
            boolean r1 = r1 instanceof N4.k
            if (r1 != 0) goto L62
            goto L63
        L62:
            r2 = r0
        L63:
            r2.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.o.b(R4.b, java.lang.Object):void");
    }

    public o(Class cls) {
        this.f5205a = 1;
        this.f5206b = new HashMap();
        this.f5207c = new HashMap();
        this.f5208d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new s(cls))) {
                Enum r42 = (Enum) field.get(null);
                String strName = r42.name();
                String string = r42.toString();
                L4.b bVar = (L4.b) field.getAnnotation(L4.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((HashMap) this.f5206b).put(str, r42);
                    }
                }
                ((HashMap) this.f5206b).put(strName, r42);
                ((HashMap) this.f5207c).put(string, r42);
                ((HashMap) this.f5208d).put(r42, strName);
            }
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        }
    }
}
