package S5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r {
    public static Long k(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // S5.r, S5.l
    public final B3.a f(u uVar) {
        u uVarN;
        AbstractC1209k.f(uVar, "path");
        Path pathF = uVar.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = u.f6810p;
                uVarN = N2.z.n(symbolicLink.toString());
            } else {
                uVarN = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lK = fileTimeCreationTime != null ? k(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lK2 = fileTimeLastModifiedTime != null ? k(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new B3.a(zIsRegularFile, zIsDirectory, uVarN, lValueOf, lK, lK2, fileTimeLastAccessTime != null ? k(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // S5.r
    public final void j(u uVar, u uVar2) throws IOException {
        AbstractC1209k.f(uVar, "source");
        AbstractC1209k.f(uVar2, "target");
        try {
            Files.move(uVar.f(), uVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e7) {
            throw new FileNotFoundException(e7.getMessage());
        }
    }

    @Override // S5.r
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
