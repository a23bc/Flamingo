package x3;

import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: x3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1930o {

    /* JADX INFO: renamed from: a */
    public final Bundle f20090a;

    public C1930o() {
        this.f20090a = new Bundle();
    }

    public void a(String str, Bitmap bitmap) {
        Integer num = (Integer) C1911M.f19993q.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(Z1.l.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f20090a.putParcelable(str, bitmap);
    }

    public void b(String str, long j3) {
        Integer num = (Integer) C1911M.f19993q.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(Z1.l.q("The ", str, " key cannot be used to put a long"));
        }
        this.f20090a.putLong(str, j3);
    }

    public void c(String str, n0 n0Var) {
        Parcelable parcelable;
        Integer num = (Integer) C1911M.f19993q.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(Z1.l.q("The ", str, " key cannot be used to put a Rating"));
        }
        if (n0Var.f20089q == null) {
            boolean zD = n0Var.d();
            int i7 = n0Var.f20087o;
            if (zD) {
                float f7 = n0Var.f20088p;
                switch (i7) {
                    case 1:
                        n0Var.f20089q = Rating.newHeartRating(i7 == 1 && f7 == 1.0f);
                        break;
                    case 2:
                        n0Var.f20089q = Rating.newThumbRating(i7 == 2 && f7 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        n0Var.f20089q = Rating.newStarRating(i7, n0Var.c());
                        break;
                    case 6:
                        if (i7 != 6 || !n0Var.d()) {
                            f7 = -1.0f;
                        }
                        n0Var.f20089q = Rating.newPercentageRating(f7);
                        break;
                    default:
                        parcelable = null;
                        break;
                }
            } else {
                n0Var.f20089q = Rating.newUnratedRating(i7);
            }
            parcelable = n0Var.f20089q;
        } else {
            parcelable = n0Var.f20089q;
        }
        this.f20090a.putParcelable(str, parcelable);
    }

    public void d(String str, String str2) {
        Integer num = (Integer) C1911M.f19993q.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(Z1.l.q("The ", str, " key cannot be used to put a String"));
        }
        this.f20090a.putCharSequence(str, str2);
    }

    public void e(CharSequence charSequence, String str) {
        Integer num = (Integer) C1911M.f19993q.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(Z1.l.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        this.f20090a.putCharSequence(str, charSequence);
    }

    public C1930o(Bundle bundle) {
        this.f20090a = bundle;
    }
}
