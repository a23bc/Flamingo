package c0;

import E0.K;
import Q0.AbstractC0347f;
import Q0.N;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import y0.AbstractC1970c;
import y0.InterfaceC1985r;

/* JADX INFO: renamed from: c0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710b extends x implements s {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public r f10543M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public t f10544N;

    @Override // c0.x
    public final void B0(B.m mVar, long j3, float f7) throws Exception {
        r rVarA = this.f10543M;
        if (rVarA == null) {
            rVarA = AbstractC0708B.a(AbstractC0708B.b((View) AbstractC0347f.i(this, AndroidCompositionLocals_androidKt.f9328f)));
            this.f10543M = rVarA;
            AbstractC1209k.c(rVarA);
        }
        t tVarA = rVarA.a(this);
        tVarA.b(mVar, this.f10608D, j3, AbstractC1267a.H(f7), this.f10610F.a(), ((h) this.f10611G.a()).f10561d, new K(19, this));
        this.f10544N = tVarA;
        AbstractC0347f.m(this);
    }

    @Override // c0.x
    public final void C0(N n7) {
        InterfaceC1985r interfaceC1985rS = n7.f5853o.f54p.S();
        t tVar = this.f10544N;
        if (tVar != null) {
            tVar.e(((h) this.f10611G.a()).f10561d, this.f10614J, this.f10610F.a());
            tVar.draw(AbstractC1970c.a(interfaceC1985rS));
        }
    }

    @Override // c0.x
    public final void E0(B.m mVar) throws Exception {
        t tVar = this.f10544N;
        if (tVar != null) {
            tVar.d();
        }
    }

    @Override // c0.s
    public final void c0() {
        this.f10544N = null;
        AbstractC0347f.m(this);
    }

    @Override // r0.AbstractC1397o
    public final void t0() throws Exception {
        r rVar = this.f10543M;
        if (rVar != null) {
            c0();
            V1.a aVar = rVar.f10592r;
            t tVar = (t) ((LinkedHashMap) aVar.f7389o).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f7389o;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f10591q.add(tVar);
            }
        }
    }
}
