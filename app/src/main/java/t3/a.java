package T3;

import W3.i;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(U3.d dVar, int i7) {
        super(dVar);
        this.f6937e = i7;
    }

    @Override // T3.b
    public final boolean a(i iVar) {
        switch (this.f6937e) {
            case 0:
                return iVar.f7813j.f5119b;
            case 1:
                return iVar.f7813j.f5121d;
            case 2:
                return iVar.f7813j.f5118a == 2;
            case 3:
                int i7 = iVar.f7813j.f5118a;
                return i7 == 3 || (Build.VERSION.SDK_INT >= 30 && i7 == 6);
            default:
                return iVar.f7813j.f5122e;
        }
    }

    @Override // T3.b
    public final boolean b(Object obj) {
        switch (this.f6937e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                S3.a aVar = (S3.a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (aVar.f6739a && aVar.f6740b) ? false : true : true ^ aVar.f6739a;
            case 3:
                S3.a aVar2 = (S3.a) obj;
                return !aVar2.f6739a || aVar2.f6741c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
