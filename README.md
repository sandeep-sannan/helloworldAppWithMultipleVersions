docker build -t gcr.io/anthos-poc-252613/istiocanary:1.0 .
docker push gcr.io/anthos-poc-252613/istiocanary:1.0
docker build -t gcr.io/anthos-poc-252613/kubecanary:1.0 .
docker push gcr.io/anthos-poc-252613/kubecanary:1.0
docker build -t gcr.io/anthos-poc-252613/kubecanary:2.0 .
docker push gcr.io/anthos-poc-252613/kubecanary:2.0 



istioctl kube-inject -f C:\Users\pmusa\Downloads\kube\IstioCanary\configfiles\workloadv2.yaml > workloadv2-inject.yaml
