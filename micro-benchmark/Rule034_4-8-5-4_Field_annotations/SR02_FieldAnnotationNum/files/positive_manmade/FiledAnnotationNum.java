public class FiledAnnotationNum {
  @Partial
  @Mock
  DataLoader loader0;
  @Partial @Mock
  DataLoader loader1;
  @Partial @Mock DataLoader loader2;

  @Inject
  @Named("default")
  private Service service0;
  @Inject @Named("default")
  private Service service1;
  @Inject @Named("default") private Service service2;
}
