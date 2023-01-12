package url_moovery.persistence;


public class LigarSql extends DAO{
	private static final String INSERT = "insert into tb_moovery(urlOriginal, code, data_inicio) values (?, (select substr(to_base64((select count(1) as total from tb_moovery l)), 1,7)), sysdate())";   
	
		public boolean create(String url)throws Exception{
			try {
				abrirBanco();
				statement = connection.prepareStatement(INSERT);
				statement.setString(1, url);
				return statement.execute();
				
			} catch (Exception e) {
				return false;
				
			}finally {
				fecharBanco();
			}
}
	public static void main(String[] args) {
		
		try {
			LigarSql ligSql = new LigarSql();
			ligSql.create("https://biscoint.io/biscointbuy/learn-more");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
