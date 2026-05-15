package I1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InputContentInfo f3447o;

    public g(Object obj) {
        this.f3447o = (InputContentInfo) obj;
    }

    @Override // I1.h
    public final void A() {
        this.f3447o.requestPermission();
    }

    @Override // I1.h
    public final Uri C() {
        return this.f3447o.getLinkUri();
    }

    @Override // I1.h
    public final ClipDescription o() {
        return this.f3447o.getDescription();
    }

    @Override // I1.h
    public final Object u() {
        return this.f3447o;
    }

    @Override // I1.h
    public final Uri w() {
        return this.f3447o.getContentUri();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3447o = new InputContentInfo(uri, clipDescription, uri2);
    }
}
