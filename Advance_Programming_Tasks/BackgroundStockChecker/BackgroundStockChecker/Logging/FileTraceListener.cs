using System;
using System.Diagnostics;
using System.IO;

namespace YourProjectNamespace.Logging
{
    public class FileTraceListener : TraceListener
    {
        private readonly string _filePath;

        public FileTraceListener(string filePath)
        {
            _filePath = filePath;
        }

        public override void Write(string? message)
        {
            File.AppendAllText(_filePath, message);
        }

        public override void WriteLine(string? message)
        {
            File.AppendAllText(_filePath, message + Environment.NewLine);
        }
    }
}
