package exam;

import dao.MemberDao;
import dto.Member;

/**
 * load()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class LoadMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		int searchId = 2;

		Member member = dao.load(searchId);

		if (member != null) {
			System.out.println(
					"ID=" + member.getId()
							+ ", 名前=" + member.getName()
							+ ", 年齢=" + member.getAge()
							+ ", 部署ID=" + member.getDep_id());

		}
	}
}
