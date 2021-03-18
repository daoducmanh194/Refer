using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReorderTime
{
    class Program
    {
        string[] Line = new string[];
        int lengthOfLine = 0;

            // Read all the file
        static void readTxt()
        {
            try
            {
                // Create instant StreamReader to read from a file
                // using statement also closes the StreamReader
                using (StreamReader sr = new StreamReader("C:/Downloads/20210312_19_00_15_Summary_Log.txt"))
                {
                    string line;

                    // read and store each line in Line[]
                    // the end of file is reached
                    while ((line = sr.ReadLine()) != null)
                    {
                        Line[lengthOfLine] = line;
                        lengthOfLine++;
                    }
                }
            }
            catch (Exception e)
            {
                // Let user know what went wrong
                Console.WriteLine("The file could not be read:");
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }

        // Write file to a new file
        static void writeToFile()
        {
            using (StreamWriter sw = new StreamWriter("F:/results.txt"))
            {
                foreach (string s in Line)
                {
                    sw.WriteLine(s);
                }
            }

            /*
            string line = "";
            using (StreamReader sr = new StreamReader("F:/results.txt"))
            {
                while ((line = sr.ReadLine()) != null)
                {
                    Console.WriteLine(line);
                }
            }
            Console.ReadKey();
            */
        }

        // Compare time
        static void Compare(string a, string b)
        {
            int hour1 = Convert.ToInt32(a[0] + a[1]);
            int min1 = Convert.ToInt32(a[3] + a[4]);
            int sec1 = Convert.ToInt32(a[6] + a[7]);
            int tiktak1 = Convert.ToInt32(a[9] + a[10] + a[11]);

            int hour2 = Convert.ToInt32(b[0] + b[1]);
            int min2 = Convert.ToInt32(b[3] + b[4]);
            int sec2 = Convert.ToInt32(b[6] + b[7]);
            int tiktak2 = Convert.ToInt32(b[9] + b[10] + b[11]);

            string tmp;
            if(hour1 > hour2)
            {
                tmp = a;
                a = b;
                b = tmp;
            }else if (hour1 == hour2)
            {
                if (min1 > min2)
                {
                    tmp = a;
                    a = b;
                    b = tmp;
                }else if(min1 == min2)
                {
                    if (sec1 > sec2)
                    {
                        tmp = a;
                        a = b;
                        b = tmp;
                    }
                    else if (sec1 == sec2)
                    {
                        if (tiktak1 > tiktak2)
                        {
                            tmp = a;
                            a = b;
                            b = tmp;
                        }
                    }
                }
            }
        }


        // sort flow time
        static void sortTime()
        {
            for(int i=0; i<lengthOfLine; ++i)
            {
                for(int j=i+1; j<lengthOfLine; j++)
                {
                    Compare(Line[i], Line[j]);
                }
            }
        }
        static void Main(string[] args)
        {
            readTxt();
            sortTime();
            writeToFile();
            Console.WriteLine("Program've finished");
            Console.ReadLine();

        }
    }
}
