Darklight Nova Core Issue: Path
====================================

Issue for [Darklight Nova Core](https://github.com/darklight-studios/darklight-nova-core)

### Function
The Path issue checks that "bad paths" (set at runtime) have been removed from the system path in Windows

### Use

1. Download the latest version from the [releases](https://github.com/darklight-studios/PathIssue/releases/) section
2. Add DNCPathIssue.jar to your DNC build path
3. Create a `PathIssue pathIssue = new PathIssue()` variable
4. Set the issue's "bad paths": `pathIssue.setBadPaths(new String[] { "C:\bad\path\one.exe", "C:\another\bad\path\" });`
5. Add `pathIssue` to the issue array
6. Start DNC!

### License
[GPLv3](LICENSE)

### Contributors
[@IsaacJG](https://github.com/IsaacJG)
