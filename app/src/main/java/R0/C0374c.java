package R0;

import java.text.BreakIterator;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: R0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374c extends AbstractC0372b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0374c f6420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0374c f6421f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f6423d;

    @Override // R0.AbstractC0372b
    public final int[] e(int i7) {
        switch (this.f6422c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f6423d;
                    if (breakIterator == null) {
                        AbstractC1209k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = this.f6423d;
                        if (breakIterator2 == null) {
                            AbstractC1209k.m("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i7);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return h(i7, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f6423d;
                    if (breakIterator3 == null) {
                        AbstractC1209k.m("impl");
                        throw null;
                    }
                    i7 = breakIterator3.following(i7);
                } while (i7 != -1);
                return null;
            default:
                if (i().length() <= 0 || i7 >= i().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!o(i7) && (!o(i7) || (i7 != 0 && o(i7 - 1)))) {
                    BreakIterator breakIterator4 = this.f6423d;
                    if (breakIterator4 == null) {
                        AbstractC1209k.m("impl");
                        throw null;
                    }
                    i7 = breakIterator4.following(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f6423d;
                if (breakIterator5 == null) {
                    AbstractC1209k.m("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i7);
                if (iFollowing2 == -1 || !n(iFollowing2)) {
                    return null;
                }
                return h(i7, iFollowing2);
        }
    }

    @Override // R0.AbstractC0372b
    public final int[] k(int i7) {
        switch (this.f6422c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = this.f6423d;
                    if (breakIterator == null) {
                        AbstractC1209k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = this.f6423d;
                        if (breakIterator2 == null) {
                            AbstractC1209k.m("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i7);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return h(iPreceding, i7);
                    }
                    BreakIterator breakIterator3 = this.f6423d;
                    if (breakIterator3 == null) {
                        AbstractC1209k.m("impl");
                        throw null;
                    }
                    i7 = breakIterator3.preceding(i7);
                } while (i7 != -1);
                return null;
            default:
                int length2 = i().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !o(i7 - 1) && !n(i7)) {
                    BreakIterator breakIterator4 = this.f6423d;
                    if (breakIterator4 == null) {
                        AbstractC1209k.m("impl");
                        throw null;
                    }
                    i7 = breakIterator4.preceding(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f6423d;
                if (breakIterator5 == null) {
                    AbstractC1209k.m("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i7);
                if (iPreceding2 == -1 || !o(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !o(iPreceding2 - 1)) {
                    return h(iPreceding2, i7);
                }
                return null;
        }
    }

    public final void m(String str) {
        switch (this.f6422c) {
            case 0:
                this.f6416a = str;
                BreakIterator breakIterator = this.f6423d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC1209k.m("impl");
                    throw null;
                }
            default:
                this.f6416a = str;
                BreakIterator breakIterator2 = this.f6423d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC1209k.m("impl");
                    throw null;
                }
        }
    }

    public boolean n(int i7) {
        if (i7 <= 0 || !o(i7 - 1)) {
            return false;
        }
        return i7 == i().length() || !o(i7);
    }

    public boolean o(int i7) {
        if (i7 < 0 || i7 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i7));
    }
}
