package U5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.List;
import u5.AbstractC1545g;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import yos.music.player.SettingsActivity;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f7199o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0878b0 f7200p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0878b0 f7201q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ SettingsActivity f7202r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(c5.d dVar, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, SettingsActivity settingsActivity) {
        super(2, dVar);
        this.f7200p = interfaceC0878b0;
        this.f7201q = interfaceC0878b02;
        this.f7202r = settingsActivity;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new V(dVar, this.f7200p, this.f7201q, this.f7202r);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7199o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC0878b0 interfaceC0878b0 = this.f7200p;
        List list = (List) interfaceC0878b0.getValue();
        if (list == null || list.isEmpty()) {
            InterfaceC0878b0 interfaceC0878b02 = this.f7201q;
            String str = (String) interfaceC0878b02.getValue();
            if (str == null || AbstractC1545g.Z(str)) {
                D5.d dVar = w5.M.f19498b;
                U u7 = new U(null, interfaceC0878b0, interfaceC0878b02, this.f7202r);
                this.f7199o = 1;
                if (AbstractC1767D.C(dVar, u7, this) == enumC0830a) {
                    return enumC0830a;
                }
            }
        }
        return oVar;
    }
}
