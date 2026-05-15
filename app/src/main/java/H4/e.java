package h4;

import S5.C0426f;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.io.IOException;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f12722o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, c5.d dVar) {
        super(2, dVar);
        this.f12722o = fVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e(this.f12722o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        f fVar = this.f12722o;
        synchronized (fVar) {
            if (!fVar.f12739z || fVar.f12724A) {
                return o.f8736a;
            }
            try {
                fVar.r();
            } catch (IOException unused) {
                fVar.f12725B = true;
            }
            try {
                if (fVar.f12736w >= 2000) {
                    fVar.t();
                }
            } catch (IOException unused2) {
                fVar.f12726C = true;
                fVar.f12737x = M3.a.D(new C0426f());
            }
            return o.f8736a;
        }
    }
}
