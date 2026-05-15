package x3;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: x3.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1910L implements Parcelable {
    public static final Parcelable.Creator<C1910L> CREATOR = new c3.b(23);

    /* JADX INFO: renamed from: o */
    public final String f19984o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f19985p;

    /* JADX INFO: renamed from: q */
    public final CharSequence f19986q;

    /* JADX INFO: renamed from: r */
    public final CharSequence f19987r;

    /* JADX INFO: renamed from: s */
    public final Bitmap f19988s;

    /* JADX INFO: renamed from: t */
    public final Uri f19989t;

    /* JADX INFO: renamed from: u */
    public final Bundle f19990u;

    /* JADX INFO: renamed from: v */
    public final Uri f19991v;

    /* JADX INFO: renamed from: w */
    public MediaDescription f19992w;

    public C1910L(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f19984o = str;
        this.f19985p = charSequence;
        this.f19986q = charSequence2;
        this.f19987r = charSequence3;
        this.f19988s = bitmap;
        this.f19989t = uri;
        this.f19990u = bundle;
        this.f19991v = uri2;
    }

    public static C1910L a(Object obj) {
        Bundle bundle;
        Uri uriA = null;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = AbstractC1908J.g(mediaDescription);
        CharSequence charSequenceI = AbstractC1908J.i(mediaDescription);
        CharSequence charSequenceH = AbstractC1908J.h(mediaDescription);
        CharSequence charSequenceC = AbstractC1908J.c(mediaDescription);
        Bitmap bitmapE = AbstractC1908J.e(mediaDescription);
        Uri uriF = AbstractC1908J.f(mediaDescription);
        Bundle bundleD = AbstractC1908J.d(mediaDescription);
        if (bundleD == null) {
            bundleD = null;
        } else {
            Z.a(bundleD);
            try {
                bundleD.isEmpty();
            } catch (BadParcelableException unused) {
                bundleD = null;
            }
        }
        if (bundleD != null) {
            bundleD = new Bundle(bundleD);
        }
        if (bundleD != null) {
            Uri uri = (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri == null) {
                bundle = bundleD;
                uriA = uri;
            } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                bundle = null;
                uriA = uri;
            } else {
                bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                bundle = bundleD;
                uriA = uri;
            }
        } else {
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = AbstractC1909K.a(mediaDescription);
        }
        C1910L c1910l = new C1910L(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        c1910l.f19992w = mediaDescription;
        return c1910l;
    }

    public final MediaDescription c() {
        MediaDescription mediaDescription = this.f19992w;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = AbstractC1908J.b();
        AbstractC1908J.n(builderB, this.f19984o);
        AbstractC1908J.p(builderB, this.f19985p);
        AbstractC1908J.o(builderB, this.f19986q);
        AbstractC1908J.j(builderB, this.f19987r);
        AbstractC1908J.l(builderB, this.f19988s);
        AbstractC1908J.m(builderB, this.f19989t);
        AbstractC1908J.k(builderB, this.f19990u);
        AbstractC1909K.b(builderB, this.f19991v);
        MediaDescription mediaDescriptionA = AbstractC1908J.a(builderB);
        this.f19992w = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f19985p) + ", " + ((Object) this.f19986q) + ", " + ((Object) this.f19987r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        c().writeToParcel(parcel, i7);
    }
}
