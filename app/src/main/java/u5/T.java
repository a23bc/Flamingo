package U5;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import yos.music.player.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7195q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(MainActivity mainActivity, int i7) {
        super(0);
        this.f7194p = i7;
        this.f7195q = mainActivity;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7194p) {
            case 0:
                return this.f7195q.d();
            case 1:
                return this.f7195q.g();
            case 2:
                return this.f7195q.e();
            case 3:
                return this.f7195q.d();
            case 4:
                return this.f7195q.g();
            case 5:
                return this.f7195q.e();
            case 6:
                return this.f7195q.d();
            case 7:
                return this.f7195q.g();
            default:
                return this.f7195q.e();
        }
    }
}
