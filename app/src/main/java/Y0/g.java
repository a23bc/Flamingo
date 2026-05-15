package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8444a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f8444a == ((g) obj).f8444a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8444a;
    }

    public final String toString() {
        int i7 = this.f8444a;
        return i7 == 0 ? "Button" : i7 == 1 ? "Checkbox" : i7 == 2 ? "Switch" : i7 == 3 ? "RadioButton" : i7 == 4 ? "Tab" : i7 == 5 ? "Image" : i7 == 6 ? "DropdownList" : i7 == 7 ? "Picker" : i7 == 8 ? "Carousel" : "Unknown";
    }
}
