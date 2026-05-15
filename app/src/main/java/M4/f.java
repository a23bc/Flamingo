package M4;

import H2.C0196m;
import K4.x;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f4783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0196m f4786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TypeToken f4787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f4788f;

    public f(g gVar, boolean z6, boolean z7, C0196m c0196m, TypeToken typeToken) {
        this.f4788f = gVar;
        this.f4784b = z6;
        this.f4785c = z7;
        this.f4786d = c0196m;
        this.f4787e = typeToken;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) throws IOException {
        if (this.f4784b) {
            aVar.K();
            return null;
        }
        x xVarE = this.f4783a;
        if (xVarE == null) {
            xVarE = this.f4786d.e(this.f4788f, this.f4787e);
            this.f4783a = xVarE;
        }
        return xVarE.a(aVar);
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        if (this.f4785c) {
            bVar.o();
            return;
        }
        x xVarE = this.f4783a;
        if (xVarE == null) {
            xVarE = this.f4786d.e(this.f4788f, this.f4787e);
            this.f4783a = xVarE;
        }
        xVarE.b(bVar, obj);
    }
}
