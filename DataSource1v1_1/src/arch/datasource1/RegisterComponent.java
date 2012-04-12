package arch.datasource1;

import arch.datasourceinterface.IDataSourceService;

public class RegisterComponent {
	
	private DataSource1 dataSource = null;
	
    public void setDataSourceService(IDataSourceService dataSourceService) {
    	dataSource = new DataSource1();
    	dataSourceService.addDataSource(dataSource);     
    }

    public void unsetDataSourceService(IDataSourceService dataSourceService) {
    	dataSourceService.removeDataSource(dataSource);
    	dataSource = null;
    }
}
