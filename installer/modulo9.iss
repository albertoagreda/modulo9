[Setup]
AppName=Modulo9
AppVersion=1.0.0
DefaultDirName={pf}\Modulo9
DefaultGroupName=Modulo9
OutputDir=C:\Users\Usuario1\IdeaProjects\modulo9\installer
OutputBaseFilename=Modulo9-Setup
Compression=lzma
SolidCompression=yes
ArchitecturesInstallIn64BitMode=x64

[Files]
Source: "C:\Users\Usuario1\IdeaProjects\modulo9\dist\Modulo9.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Usuario1\IdeaProjects\modulo9\dist\runtime\*"; DestDir: "{app}\runtime"; Flags: recursesubdirs

[Icons]
Name: "{group}\Modulo9"; Filename: "{app}\Modulo9.exe"
Name: "{commondesktop}\Modulo9"; Filename: "{app}\Modulo9.exe"
