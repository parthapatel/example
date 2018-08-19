@RestController
@RequestMapping()
public class UserController{
	
	private UserService userService;

	public UserController(){
		this.userService = new UserService();
	}

	@GetMapping
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}