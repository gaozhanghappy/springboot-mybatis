package git.gaozhanghappy;

import git.gaozhanghappy.mapper.TbUserMapper;
import git.gaozhanghappy.model.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	@Autowired
	private TbUserMapper tbUserMapper;

	@Test
	public void contextLoads() {
	}
	@Test
	public void myUser(){
		final TbUser tbUser = new TbUser();
		final long start = System.currentTimeMillis();
		for (int i=0;i<1000;i++){
			tbUser.setName("lisi"+i);
			tbUser.setPassword("1234");

			tbUserMapper.insert(tbUser);
		}
		final long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);

	}

}
