package N3;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f5157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f5158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f5159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f5160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f5161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5162f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f5162f == wVar.f5162f && this.f5157a.equals(wVar.f5157a) && this.f5158b == wVar.f5158b && this.f5159c.equals(wVar.f5159c) && this.f5160d.equals(wVar.f5160d)) {
            return this.f5161e.equals(wVar.f5161e);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5161e.hashCode() + ((this.f5160d.hashCode() + ((this.f5159c.hashCode() + ((this.f5158b.hashCode() + (this.f5157a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f5162f;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f5157a + "', mState=" + this.f5158b + ", mOutputData=" + this.f5159c + ", mTags=" + this.f5160d + ", mProgress=" + this.f5161e + '}';
    }
}
