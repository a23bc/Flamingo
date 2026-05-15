package b1;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10016a;

    public v() {
        this.f10016a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f10016a == ((v) obj).f10016a;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10016a ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f10016a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public v(boolean z6) {
        this.f10016a = z6;
    }
}
