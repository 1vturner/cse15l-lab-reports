# The Find Command

**Max Depth:**
------------------------
**Source:** https://www.geeksforgeeks.org/mindepth-maxdepth-linux-find-command-limiting-search-specific-directory/

Using Max Depth allows you get an index of each file and directory. To determine the index you look at the slashes before the file or directory. When running this command you add the number of the index of the file/directory you are looking for. In additon, it also gives you the ability to see what files are in your directory like `ls`.

```
vickyyy.t@MacBook-Pro-3 stringsearch-data % find technical/government -maxdepth 1
technical/government
technical/government/About_LSC
technical/government/Env_Prot_Agen
technical/government/Alcohol_Problems
technical/government/Gen_Account_Office
technical/government/Post_Rate_Comm
technical/government/Media
```
^ Here this command finds the files at depth 1 which means everythign after technical/government

```
vickyyy.t@MacBook-Pro-3 stringsearch-data % find technical/plos  -maxdepth 2 
technical/plos
technical/plos/pmed.0020273.txt
technical/plos/journal.pbio.0030032.txt
technical/plos/pmed.0020065.txt
technical/plos/pmed.0020071.txt
technical/plos/pmed.0020059.txt
technical/plos/pmed.0010039.txt
technical/plos/journal.pbio.0020354.txt
technical/plos/pmed.0010010.txt
technical/plos/journal.pbio.0020156.txt
technical/plos/pmed.0020104.txt
technical/plos/pmed.0020272.txt
technical/plos/pmed.0020258.txt
technical/plos/pmed.0020099.txt
technical/plos/journal.pbio.0020140.txt
technical/plos/journal.pbio.0020183.txt
technical/plos/journal.pbio.0020430.txt
technical/plos/journal.pbio.0020394.txt
technical/plos/journal.pbio.0020431.txt
technical/plos/journal.pbio.0020419.txt
technical/plos/pmed.0010013.txt
technical/plos/pmed.0020113.txt
technical/plos/journal.pbio.0020169.txt
technical/plos/pmed.0020098.txt
technical/plos/journal.pbio.0020035.txt
technical/plos/pmed.0020067.txt
technical/plos/pmed.0020073.txt
technical/plos/journal.pbio.0030024.txt
technical/plos/journal.pbio.0020223.txt
technical/plos/pmed.0020249.txt
technical/plos/pmed.0020275.txt
technical/plos/journal.pbio.0020019.txt
technical/plos/pmed.0020088.txt
technical/plos/journal.pbio.0020145.txt
technical/plos/pmed.0020103.txt
technical/plos/pmed.0020117.txt
technical/plos/journal.pbio.0020353.txt
technical/plos/journal.pbio.0020347.txt
technical/plos/journal.pbio.0020420.txt
technical/plos/journal.pbio.0020346.txt
technical/plos/journal.pbio.0020187.txt
technical/plos/pmed.0020116.txt
technical/plos/pmed.0020102.txt
technical/plos/journal.pbio.0020150.txt
technical/plos/pmed.0020062.txt
technical/plos/pmed.0020274.txt
technical/plos/journal.pbio.0020232.txt
technical/plos/journal.pbio.0030021.txt
CONT...
```
^ A lengthy output but this shows the files at depth 2 starting after technical government 


**Find FILE/DIRECTORYNAME -size__:**
------------------------
**Source:** https://www.educba.com/linux-size/

Using -size__ allows you to find files maximum or minimum storage size a file has. When running this if I add 2M after size it will bring me the files all under 2Mb. This is a significant command becuase when trying to submit files you are able to see their size beforehand and will know if it can be downloaded/submitted or not.  


```
[cs15lsp23ff@ieng6-201]:docsearch:217$ find technical/plos -size 1M
technical/plos
technical/plos/journal.pbio.0020001.txt
technical/plos/journal.pbio.0020010.txt
technical/plos/journal.pbio.0020012.txt
technical/plos/journal.pbio.0020013.txt
technical/plos/journal.pbio.0020019.txt
technical/plos/journal.pbio.0020028.txt
technical/plos/journal.pbio.0020035.txt
technical/plos/journal.pbio.0020040.txt
technical/plos/journal.pbio.0020042.txt
technical/plos/journal.pbio.0020043.txt
technical/plos/journal.pbio.0020046.txt
technical/plos/journal.pbio.0020047.txt
technical/plos/journal.pbio.0020052.txt
technical/plos/journal.pbio.0020053.txt
technical/plos/journal.pbio.0020054.txt
technical/plos/journal.pbio.0020063.txt
technical/plos/journal.pbio.0020064.txt
technical/plos/journal.pbio.0020067.txt
technical/plos/journal.pbio.0020068.txt
technical/plos/journal.pbio.0020071.txt
technical/plos/journal.pbio.0020073.txt
technical/plos/journal.pbio.0020100.txt
technical/plos/journal.pbio.0020101.txt
technical/plos/journal.pbio.0020105.txt
technical/plos/journal.pbio.0020112.txt
CONT...
```
^ These are all files that are 1MB in plos, useful becuase sometimes file sizes dictate where and what you can upload


```
[cs15lsp23ff@ieng6-201]:docsearch:222$ find technical/government -size 1M
technical/government
technical/government/About_LSC
technical/government/About_LSC/CONFIG_STANDARDS.txt
technical/government/About_LSC/Comments_on_semiannual.txt
technical/government/About_LSC/LegalServCorp_v_VelazquezDissent.txt
technical/government/About_LSC/LegalServCorp_v_VelazquezOpinion.txt
technical/government/About_LSC/LegalServCorp_v_VelazquezSyllabus.txt
technical/government/About_LSC/ODonnell_et_al_v_LSCdecision.txt
technical/government/About_LSC/ONTARIO_LEGAL_AID_SERIES.txt
technical/government/About_LSC/Progress_report.txt
technical/government/About_LSC/Protocol_Regarding_Access.txt
technical/government/About_LSC/Special_report_to_congress.txt
technical/government/About_LSC/State_Planning_Report.txt
technical/government/About_LSC/State_Planning_Special_Report.txt
technical/government/About_LSC/Strategic_report.txt
technical/government/About_LSC/commission_report.txt
technical/government/About_LSC/conference_highlights.txt
technical/government/About_LSC/diversity_priorities.txt
technical/government/About_LSC/reporting_system.txt
technical/government/Alcohol_Problems
technical/government/Alcohol_Problems/DraftRecom-PDF.txt
technical/government/Alcohol_Problems/Session2-PDF.txt
technical/government/Alcohol_Problems/Session3-PDF.txt
technical/government/Alcohol_Problems/Session4-PDF.txt
technical/government/Env_Prot_Agen
technical/government/Env_Prot_Agen/1-3_meth_901.txt
technical/government/Env_Prot_Agen/atx1-6.txt
technical/government/Env_Prot_Agen/bill.txt
technical/government/Env_Prot_Agen/ctf1-6.txt
technical/government/Env_Prot_Agen/ctf7-10.txt
technical/government/Env_Prot_Agen/ctm4-10.txt
technical/government/Env_Prot_Agen/final.txt
technical/government/Env_Prot_Agen/jeffordslieberm.txt
technical/government/Env_Prot_Agen/multi102902.txt
technical/government/Env_Prot_Agen/nov1.txt
CONT...
```
^ These are all files that are 1MB in government, useful becuase sometimes file sizes dictate where and what you can upload

**Find FILE/DIRECTORYNAME -empty:**
------------------------
**Source:** https://www.tecmint.com/empty-delete-file-content-linux/

This will find all the empty folders and files that are empty within the working directory

```
vickyyy.t@MacBook-Pro-3 docsearch % find technical/government -empty      
vickyyy.t@MacBook-Pro-3 docsearch % 
```
^There were no empty folders/files so it did not return anything and is ready for another argument

```
vickyyy.t@MacBook-Pro-3 docsearch % find emptyup/emp -empty      
vickyyy.t@MacBook-Pro-3 docsearch % emp

```
^I added an additonal folder and added an empty file called emp. Since there was an empty file inside my emptyup folder it returned emp


**Find ./ -name "__:**
------------------------
**Source:** https://www.plesk.com/blog/various/find-files-in-linux-via-command-line/

This command will find files/directories that have the same name or characters with what you fill in the blank.

```
[cs15lsp23ff@ieng6-201]:docsearch:223$ find ./ -name "te*"
./technical
./technical/government/Env_Prot_Agen/tech_adden.txt
./technical/government/Env_Prot_Agen/tech_sectiong.txt
```
^This found everything with te in the files 

```
[cs15lsp23ff@ieng6-201]:docsearch:224$ find ./ -name "report*"
./technical/government/About_LSC/reporting_system.txt
```
^This found everything with report in the files 
