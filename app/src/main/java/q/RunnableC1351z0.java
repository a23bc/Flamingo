package q;

/* JADX INFO: renamed from: q.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1351z0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D0 f15438p;

    public /* synthetic */ RunnableC1351z0(D0 d02, int i7) {
        this.f15437o = i7;
        this.f15438p = d02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15437o) {
            case 0:
                C1334q0 c1334q0 = this.f15438p.f15151q;
                if (c1334q0 != null) {
                    c1334q0.setListSelectionHidden(true);
                    c1334q0.requestLayout();
                }
                break;
            default:
                D0 d02 = this.f15438p;
                C1334q0 c1334q02 = d02.f15151q;
                if (c1334q02 != null && c1334q02.isAttachedToWindow() && d02.f15151q.getCount() > d02.f15151q.getChildCount() && d02.f15151q.getChildCount() <= d02.f15136A) {
                    d02.f15148M.setInputMethodMode(2);
                    d02.c();
                    break;
                }
                break;
        }
    }
}
