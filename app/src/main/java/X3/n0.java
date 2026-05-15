package x3;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new k0(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f20088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Parcelable f20089q;

    public n0(int i7, float f7) {
        this.f20087o = i7;
        this.f20088p = f7;
    }

    public static n0 a(Parcelable parcelable) {
        n0 n0Var;
        n0 n0Var2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        n0Var2 = new n0(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        n0Var = new n0(1, rating.hasHeart() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        n0Var = new n0(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        n0Var2 = e(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            n0Var2 = new n0(6, percentRating);
                        }
                        break;
                }
                n0Var2 = n0Var;
            }
            n0Var2.getClass();
            n0Var2.f20089q = parcelable;
        }
        return n0Var2;
    }

    public static n0 e(int i7, float f7) {
        float f8;
        if (i7 == 3) {
            f8 = 3.0f;
        } else if (i7 == 4) {
            f8 = 4.0f;
        } else {
            if (i7 != 5) {
                return null;
            }
            f8 = 5.0f;
        }
        if (f7 < 0.0f || f7 > f8) {
            return null;
        }
        return new n0(i7, f7);
    }

    public final float c() {
        int i7 = this.f20087o;
        if ((i7 == 3 || i7 == 4 || i7 == 5) && d()) {
            return this.f20088p;
        }
        return -1.0f;
    }

    public final boolean d() {
        return this.f20088p >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f20087o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f20087o);
        sb.append(" rating=");
        float f7 = this.f20088p;
        sb.append(f7 < 0.0f ? "unrated" : String.valueOf(f7));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f20087o);
        parcel.writeFloat(this.f20088p);
    }
}
