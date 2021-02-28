
public class DrivenScript {

	public static void main(String[] args) throws Exception {
		String sPath="D:\\Book1.xlsx";
		ExcelUtils.setExcelFile(sPath, "Sheet1");
		
		for(int iRow=1;iRow<=7;iRow++)
		{
			String sActionKeyword=ExcelUtils.getCellData(iRow,0);
			if(sActionKeyword.equals("OpenBrowser"))
			{
				ActionKeywords.OpenBrowser();
			}
			
			else if(sActionKeyword.equals("navigate"))
			{
				ActionKeywords.navigate();
			}
			
			else if(sActionKeyword.equals("InputUsername"))
			{
				ActionKeywords.InputUsername();
			}
			
			else if(sActionKeyword.equals("ClickNext"))
			{
				ActionKeywords.ClickNext();
			}
			else if(sActionKeyword.equals("InputPassword"))
			{
				ActionKeywords.InputPassworde();
			}
			else if(sActionKeyword.equals("ClickSignin"))
			{
				ActionKeywords.ClickSignin();
			}
			
			else if(sActionKeyword.equals("CloseBrowser"))
			{
				ActionKeywords.CloseBrowser();
			}
			
			
			
			
		}
	}

}
