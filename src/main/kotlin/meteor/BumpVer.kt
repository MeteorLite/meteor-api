package meteor

import java.io.File
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * This will help when we automate api publishing to hosting
 */
object BumpVer {
    @JvmStatic
    fun main(args: Array<String>) {
        val kts = File("./build.gradle.kts")
        val splitStart = "val release by rootProject.extra { \""
        val splitEnd = '"'
        val verSplit = '.'
        val lines = kts.readLines().toString()
        val version = lines.split(splitStart)[1].split(splitEnd)[0]
        val verMajor = version.split(verSplit)[0].toInt()
        val verMinor = version.split(verSplit)[1].toInt()
        val verPatch = version.split(verSplit)[2].toInt()
        val currentVer = "\"$verMajor.$verMinor.$verPatch\""
        val bumpedVer = "\"$verMajor.$verMinor.${verPatch + 1}\""
        val path = kts.toPath()
        val charset: Charset = StandardCharsets.UTF_8

        var content = String(Files.readAllBytes(path), charset)
        content = content.replaceFirst(currentVer.toRegex(), bumpedVer)
        Files.write(path, content.toByteArray(charset))
        println("Bumped meteor-api: $currentVer -> $bumpedVer")
    }
}