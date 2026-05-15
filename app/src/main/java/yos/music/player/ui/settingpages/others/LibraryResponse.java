package yos.music.player.ui.settingpages.others;

import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryResponse {
    public static final int $stable = 8;
    private final List<Library> libraries;

    public LibraryResponse(List<Library> list) {
        AbstractC1209k.f(list, "libraries");
        this.libraries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LibraryResponse copy$default(LibraryResponse libraryResponse, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = libraryResponse.libraries;
        }
        return libraryResponse.copy(list);
    }

    public final List<Library> component1() {
        return this.libraries;
    }

    public final LibraryResponse copy(List<Library> list) {
        AbstractC1209k.f(list, "libraries");
        return new LibraryResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LibraryResponse) && AbstractC1209k.a(this.libraries, ((LibraryResponse) obj).libraries);
    }

    public final List<Library> getLibraries() {
        return this.libraries;
    }

    public int hashCode() {
        return this.libraries.hashCode();
    }

    public String toString() {
        return "LibraryResponse(libraries=" + this.libraries + ')';
    }
}
