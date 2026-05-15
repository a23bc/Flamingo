package android.support.v4.media;

import K1.h;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new h(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f8898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CharSequence f8899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CharSequence f8900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f8901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bitmap f8902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f8903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f8904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri f8905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MediaDescription f8906w;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f8898o = str;
        this.f8899p = charSequence;
        this.f8900q = charSequence2;
        this.f8901r = charSequence3;
        this.f8902s = bitmap;
        this.f8903t = uri;
        this.f8904u = bundle;
        this.f8905v = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f8899p) + ", " + ((Object) this.f8900q) + ", " + ((Object) this.f8901r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        MediaDescription mediaDescriptionA = this.f8906w;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.f8898o);
            a.p(builderB, this.f8899p);
            a.o(builderB, this.f8900q);
            a.j(builderB, this.f8901r);
            a.l(builderB, this.f8902s);
            a.m(builderB, this.f8903t);
            a.k(builderB, this.f8904u);
            b.b(builderB, this.f8905v);
            mediaDescriptionA = a.a(builderB);
            this.f8906w = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i7);
    }
}
