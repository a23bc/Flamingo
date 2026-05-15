package U5;

import android.content.Context;
import android.os.Build;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import j5.AbstractC1109c;
import java.util.Arrays;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;
import yos.music.player.MainActivity;

/* JADX INFO: renamed from: U5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0440l extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f7244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e.i f7245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7246q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0440l(Context context, e.i iVar, MainActivity mainActivity, c5.d dVar) {
        super(2, dVar);
        this.f7244o = context;
        this.f7245p = iVar;
        this.f7246q = mainActivity;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0440l(this.f7244o, this.f7245p, this.f7246q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0440l c0440l = (C0440l) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c0440l.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        String[] strArr = new String[0];
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f7244o;
        if ((i7 >= 33 && AbstractC1109c.n(context, "android.permission.READ_MEDIA_AUDIO") != 0) || (i7 < 33 && AbstractC1109c.n(context, "android.permission.READ_EXTERNAL_STORAGE") != 0)) {
            if (i7 >= 33) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, 1);
                System.arraycopy(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 0, objArrCopyOf, 0, 1);
                AbstractC1209k.c(objArrCopyOf);
                strArr = (String[]) objArrCopyOf;
            } else {
                Object[] objArrCopyOf2 = Arrays.copyOf(strArr, 1);
                System.arraycopy(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0, objArrCopyOf2, 0, 1);
                AbstractC1209k.c(objArrCopyOf2);
                strArr = (String[]) objArrCopyOf2;
            }
        }
        String[] strArr2 = strArr;
        if (AbstractC1109c.n(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
            strArr2 = strArr;
            if (i7 >= 31) {
                int length = strArr.length;
                Object[] objArrCopyOf3 = Arrays.copyOf(strArr, length + 1);
                objArrCopyOf3[length] = "android.permission.BLUETOOTH_CONNECT";
                strArr2 = (String[]) objArrCopyOf3;
            }
        }
        ?? r12 = strArr2;
        r12 = strArr2;
        if (AbstractC1109c.n(context, "android.permission.POST_NOTIFICATIONS") != 0 && i7 >= 33) {
            int length2 = strArr2.length;
            Object[] objArrCopyOf4 = Arrays.copyOf(strArr2, 1 + length2);
            objArrCopyOf4[length2] = "android.permission.POST_NOTIFICATIONS";
            r12 = (String[]) objArrCopyOf4;
        }
        if (r12.length != 0) {
            this.f7245p.k0(r12);
        }
        int i8 = MainActivity.f20573K;
        this.f7246q.m(context, false);
        return Y4.o.f8736a;
    }
}
