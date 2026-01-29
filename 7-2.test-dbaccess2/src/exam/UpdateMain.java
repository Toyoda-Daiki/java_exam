package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {

		MemberDao dao = new MemberDao();
		Member member = new Member();
		member.setId(2);
		member.setName("ジロー");
		member.setAge(100);
		member.setDepId(2);

		System.out.println(
				"ID=" + member.getId()
						+ ", 名前=" + member.getName()
						+ ", 年齢=" + member.getAge()
						+ ", 部署ID=" + member.getDep_id());

		dao.update(member);

		System.out.println("update完了");
	}
}
