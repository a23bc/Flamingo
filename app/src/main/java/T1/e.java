package T1;

import android.os.Build;
import java.util.ArrayList;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f6851d;

    public e(f fVar) {
        this.f6851d = fVar;
    }

    @Override // android.support.v4.media.session.b
    public final void y(Throwable th) {
        this.f6851d.f6852a.f(th);
    }

    @Override // android.support.v4.media.session.b
    public final void z(U3.h hVar) {
        f fVar = this.f6851d;
        fVar.f6854c = hVar;
        U3.h hVar2 = fVar.f6854c;
        j jVar = fVar.f6852a;
        fVar.f6853b = new A0.b(hVar2, jVar.f6866g, jVar.f6867i, Build.VERSION.SDK_INT >= 34 ? m.a() : AbstractC1267a.x());
        j jVar2 = fVar.f6852a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f6860a.writeLock().lock();
        try {
            jVar2.f6862c = 1;
            arrayList.addAll(jVar2.f6861b);
            jVar2.f6861b.clear();
            jVar2.f6860a.writeLock().unlock();
            jVar2.f6863d.post(new h(arrayList, jVar2.f6862c, null));
        } catch (Throwable th) {
            jVar2.f6860a.writeLock().unlock();
            throw th;
        }
    }
}
