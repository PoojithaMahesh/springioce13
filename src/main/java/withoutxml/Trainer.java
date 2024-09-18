package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Trainer {
    @Value("1")
	private int id;
    @Value("Poojitha")
	private String name;
	@Autowired
	private Student student;
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	
}
