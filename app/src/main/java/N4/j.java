package N4;

import H2.C0196m;
import K4.x;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    public final String f5185a;

    /* JADX INFO: renamed from: b */
    public final Field f5186b;

    /* JADX INFO: renamed from: c */
    public final String f5187c;

    /* JADX INFO: renamed from: d */
    public final boolean f5188d;

    /* JADX INFO: renamed from: e */
    public final boolean f5189e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Method f5190f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f5191g;
    public final /* synthetic */ x h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0196m f5192i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TypeToken f5193j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f5194k;
    public final /* synthetic */ boolean l;

    public j(String str, Field field, boolean z6, boolean z7, Method method, boolean z8, x xVar, C0196m c0196m, TypeToken typeToken, boolean z9, boolean z10) {
        this.f5190f = method;
        this.f5191g = z8;
        this.h = xVar;
        this.f5192i = c0196m;
        this.f5193j = typeToken;
        this.f5194k = z9;
        this.l = z10;
        this.f5185a = str;
        this.f5186b = field;
        this.f5187c = field.getName();
        this.f5188d = z6;
        this.f5189e = z7;
    }

    public final void a(R4.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.f5188d) {
            Field field = this.f5186b;
            Method method = this.f5190f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e7) {
                    throw new K4.o(Z1.l.q("Accessor ", P4.c.d(method, false), " threw exception"), e7.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.j(this.f5185a);
            boolean z6 = this.f5191g;
            x oVar = this.h;
            if (!z6) {
                oVar = new o(this.f5192i, oVar, this.f5193j.getType());
            }
            oVar.b(bVar, objInvoke);
        }
    }
}
