public class UserPresenter {
    private User model;
    private UserView view;

    public UserPresenter(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void handleRegistration() {
        String name = view.getInput("Введите имя:");
        String login = view.getInput("Введите логин:");
        String password = view.getInput("Введите пароль:");
        model.setName(name);
        model.setLogin(login);
        model.setPassword(password);
        System.out.println("Пользователь зарегистрирован под именем: " + model.getName() + " и логином: " + model.getLogin());
    }
}

