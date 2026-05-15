package M5;

import android.content.Intent;
import android.os.Build;
import f0.C0894j0;
import java.io.IOException;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import yos.music.player.data.libraries.Folder;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f4866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4867q;

    public /* synthetic */ k(Object obj, int i7, Object obj2) {
        this.f4865o = i7;
        this.f4866p = obj;
        this.f4867q = obj2;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y4.o oVar = Y4.o.f8736a;
        Object obj = this.f4867q;
        Object obj2 = this.f4866p;
        switch (this.f4865o) {
            case 0:
                o oVar2 = (o) obj;
                s sVar = (s) obj2;
                try {
                } catch (IOException e7) {
                    oVar2.b(2, 2, e7);
                } catch (Throwable th) {
                    oVar2.b(3, 3, null);
                    G5.b.b(sVar);
                    throw th;
                }
                if (!sVar.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (sVar.b(false, this)) {
                }
                oVar2.b(1, 9, null);
                G5.b.b(sVar);
                return oVar;
            case 1:
                C0894j0 c0894j0 = a6.a.f8880a;
                String str = (String) obj2;
                AbstractC1209k.f(str, "name");
                a6.a.f8880a.setValue(str);
                N5.l.D((y3.x) obj, "AlbumInfo");
                return oVar;
            case 2:
                if (Build.VERSION.SDK_INT >= 29) {
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    intent.putExtra("android.provider.extra.INITIAL_URI", N5.l.m(((Folder) obj).getPath(), true));
                    intent.addFlags(1);
                    ((e.i) obj2).k0(intent);
                }
                return oVar;
            default:
                Folder folder = (Folder) obj2;
                a6.a.a(folder.getName(), folder.getSongs());
                N5.l.D((y3.x) obj, "NormalMusic");
                return oVar;
        }
    }

    public k(o oVar, s sVar) {
        this.f4865o = 0;
        this.f4867q = oVar;
        this.f4866p = sVar;
    }
}
