package B1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f726a;

    public j(Object obj) {
        this.f726a = A3.a.g(obj);
    }

    @Override // B1.i
    public final String a() {
        return this.f726a.toLanguageTags();
    }

    @Override // B1.i
    public final Object b() {
        return this.f726a;
    }

    public final boolean equals(Object obj) {
        return this.f726a.equals(((i) obj).b());
    }

    @Override // B1.i
    public final Locale get(int i7) {
        return this.f726a.get(i7);
    }

    public final int hashCode() {
        return this.f726a.hashCode();
    }

    @Override // B1.i
    public final boolean isEmpty() {
        return this.f726a.isEmpty();
    }

    @Override // B1.i
    public final int size() {
        return this.f726a.size();
    }

    public final String toString() {
        return this.f726a.toString();
    }
}
